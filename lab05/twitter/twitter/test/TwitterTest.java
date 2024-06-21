import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;

class TwitterTest {

    @Test
    void actual_call() {

        Twitter twitter = new Twitter();

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(true, actual);
    }

    @Test
    void mock_full_object() {

        Twitter twitter = createMock("twitter", Twitter.class);

        expect(twitter.loadTweet()).andReturn("hello @me");
        expect(twitter.loadTweet()).andReturn("hello @you");
        replay(twitter);

        String actual;

        actual = twitter.loadTweet();
        assertEquals("hello @me", actual);

        actual = twitter.loadTweet();
        assertEquals("hello @you", actual);
    }

    @Test
    void mock_partial_object() {

        Twitter twitter = partialMockBuilder(Twitter.class)
                .addMockedMethod("loadTweet")
                .createMock();

        expect(twitter.loadTweet()).andReturn("hello @me").times(2);
        replay(twitter);

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(true, actual);

        actual = twitter.isMentionned("you");
        assertEquals(false, actual);
    }

    @Test
    void isMentionned_lookForAtSymbol() {
        Twitter twitter = new Twitter();

        boolean actualMe = twitter.isMentionned("me");
        boolean actualYou = twitter.isMentionned("you");

        assertEquals(true, actualMe);
        assertEquals(false, actualYou);
    }

    @Test
    void isMentionned_dontReturnSubstringMatches() {
        Twitter twitter = partialMockBuilder(Twitter.class)
                .addMockedMethod("loadTweet")
                .createMock();

        expect(twitter.loadTweet()).andReturn("hello @meat").times(2);
        replay(twitter);

        boolean actualMe = twitter.isMentionned("me");
        boolean actualMeat = twitter.isMentionned("meat");

        assertEquals(false, actualMe);
        assertEquals(true, actualMeat);
    }

    @Test
    void isMentionned_superStringNotFound() {
        Twitter twitter = partialMockBuilder(Twitter.class)
                .addMockedMethod("loadTweet")
                .createMock();

        expect(twitter.loadTweet()).andReturn("hello @me").times(2);
        replay(twitter);

        boolean actualMe = twitter.isMentionned("me");
        boolean actualMeat = twitter.isMentionned("meat");

        assertEquals(true, actualMe);
        assertEquals(false, actualMeat);
    }

    @Test
    void isMentionned_handleNull() {
        Twitter twitter = partialMockBuilder(Twitter.class)
                .addMockedMethod("loadTweet")
                .createMock();

        expect(twitter.loadTweet()).andReturn(null).times(2);
        replay(twitter);

        boolean actualMe = twitter.isMentionned("me");
        boolean actualMeat = twitter.isMentionned("meat");

        assertEquals(false, actualMe);
        assertEquals(false, actualMeat);
    }
}