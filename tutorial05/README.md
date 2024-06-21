
Exercise 1:
1.
ID      |   Start State         | Event      | Condition        | Reaction       | New State
1       |   Idle                | coin       | -                | addToAmount    | Receiving Coins
2       |   Receiving Coins     | returnCoins| -                | returnCoins    | Idle
3       |   Idle                | coin       | -                | addToAmount    | Receiving Coins
4       |   Receiving Coins     | coin       | -                | addToAmount    | Receiving Coins
5       |   Receiving Coins     | selection  | -                | checkSelection | Checking Selection
6       |   Checking Selection  | message    | notEnoughBalance | message        | Receiving Coins
7       |   Checking Selection  | message    | notAvailable     | message        | Receiving Coins
8       |   Checking Selection  | selectionOk| change           | selectionOk    | Receiving Coins
9       |   Checlomg Selection  | selectionOk| not change       | selectionOk    | Idle

3.
ID      |   Start State         | Event      | Condition        | Reaction       | New State
1       |   Idle                | coin       | -                | addToAmount    | Receiving Coins
2       |   Receiving Coins     | returnCoins| -                | returnCoins    | Idle
3       |   Idle                | coin       | -                | addToAmount    | Receiving Coins
4       |   Receiving Coins     | coin       | -                | addToAmount    | Receiving Coins
5       |   Receiving Coins     | selection  | -                | checkSelection | Checking Selection
6       |   Checking Selection  | message    | notEnoughBalance | message        | Receiving Coins
7       |   Checking Selection  | message    | notAvailable     | message        | Receiving Coins
8       |   Checking Selection  | selectionOk| change           | selectionOk    | Receiving Coins
9       |   Checlomg Selection  | selectionOk| not change       | selectionOk    | Idle

4.
Starting State  |   event    |   condition   |   New State
Idle            | selectionOK|   Not change  |   Error


Exercise 2:
1.
Starting State  |   event   |   condition   |   New State
D               |   b       |   y           |   C

