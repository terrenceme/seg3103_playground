Below find test cases for lab 2 exercise 1.
To run exercise 2 code run ./ecs/bin/test 

###################################################################################################################################################################################################
Tutorial 1: EC's
Username:
EC  |   Description                                                             |   Valid/Invalid
U1  |   6 =< length =< 12, start with letter, contains only letters and digit   |   Valid                                
U2  |   length < 6                                                              |   Invalid
U3  |   length > 12                                                             |   Invalid
U4  |   starts with non-letter                                                  |   Invalid
U5  |   contains non-letters/non-digits                                         |   Invalid

FirstName:
EC  |   Description                                                 |   Valid/Invalid
F1  |   empyty string                                               |   Valid
F2  |   string begins with letter, contains only letters and spaces |   Valid
F3  |   starts with space                                           |   Invalid
F4  |   contains non-letters/non-spaces                             |   Invalid
  

LastName:
EC  |   Description                                                 |   Valid/Invalid
F1  |   empyty string                                               |   Valid
F2  |   string begins with letter, contains only letters and spaces |   Valid
F3  |   starts with space                                           |   Invalid
F4  |   contains non-letters/non-spaces                             |   Invalid

Email: 
EC  |   Description                                                                                                     |   Valid/Invalid
E1  |   format: <local-part>@<domain> Where <localpart> consists of letters, digits and characters ‘.’,‘_’,‘+’,‘-’. domain has least two fragments separated by dots ‘.’. Each fragment must consist of letters, digits, ‘-’ except the last fragment that must only consist of letters.                             |Valid
E2  |   <local-part> contains special characters                                                                        |Invalid
E3  |   No @                                                                                                            |Invalid
E4  |   <domain> 1 fragment                                                                                             |Invalid
E5  |   fragments contains non-letters/digits/'-'                                                                       |Invalid
E6  |   fragment 2 contains non-letters                                                                                 |Invalid    


City: (Dropdown with only 4 options)
EC  |   Description                                         |   Valid/Invalid
C1  |   City = 'Ottawa', 'Toronto', 'Montreal' or 'Halifax' |   Valid



PostalCode:
EC  |   Description                                                                                                     |   Valid/Invalid
P1  |   string with format: <letter><digit><letter><digit><letter><digit><letter> is capital that is not D, F, I, O, Q or U, 
        and the first position also does not make use of the letters W or Z                                             |Valid
P2  |   string with format: <letter><digit><letter><Space><digit><letter><digit><letter> is capital that is not D, F, I, O, Q or U, 
        and the first position also does not make use of the letters W or Z                                             |Valid
P3  |   not 6 characters                                                                                                |Invalid
P4  |   <letter> is not capital                                                                                         |Invalid
P5  |   6 charcters but incorrect format                                                                                    |Invalid

###################################################################################################################################################################################################
LAB EXERCISE 1:
TestCases:

Username:
Test Case       |   Expected Result |   Actual Results  |   Verdict(Pass, Fail, Inconclusive)
terrenceme      |   Valid           |   Valid           |   Pass
ter             |   Invalid         |   Invalid         |   Pass
terrencemeeee   |   Invalid         |   Invalid         |   Pass
9errenceme      |   Invalid         |   Invalid         |   Pass
terrenceme#     |   Invalid         |   Invalid         |   Pass

FirstName & LastName:
Test Case       |   Expected Result |   Actual Results  |   Verdict(Pass, Fail, Inconclusive)
(null)          |   Valid           |   Valid           |   Pass
Terrence        |   Valid           |   Valid           |   Pass
 Terrence       |   Invalid         |   Invalid         |   Pass
Terrence#       |   Invalid         |   Invalid         |   Pass

Email:
Test Case           |   Expected Result |   Actual Results  |   Verdict(Pass, Fail, Inconclusive)
terrence@gmail.com  |   Valid           |   Valid           |   Pass
$terrence@gmail.com |   Invalid         |   Invalid         |   Pass
terrencegmail.com   |   Invalid         |   Invalid         |   Pass
terrence@gmailcom   |   Invalid         |   Invalid         |   Pass
terrence@gmail#.com |   Invalid         |   Invalid         |   Pass
terrence@gmail.1com |   Invalid         |   Invalid         |   Pass

PostalCode:
Test Case        |   Expected Result |   Actual Results  |   Verdict(Pass, Fail, Inconclusive)
K0H4X5           |   Valid           |   Valid           |   Pass
K0H 4X5          |   Valid           |   Valid           |   Pass
K0H4X5H          |   Invalid         |   Invalid         |   Pass
k0H4X5           |   Invalid         |   Invalid         |   Pass
K0H45X           |   Invalid         |   Invalid         |   Pass