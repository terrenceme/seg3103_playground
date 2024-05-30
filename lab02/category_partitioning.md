Category Partitioning
Problem

Consider the nextdate function:
• Input: month, day, year representing a date with 1 <= month <= 12, 1 <= day <= 31,
year >= 0

• Output: date of the day after the input date
Provide a black box test design for nextdate based on Category Partitioning.

1. Identify Parameters and Environmental conditions

Testable features: nextDate(currentDate)
Parameters: (day, month, year) 
Environmental conditions: 
    - leap year every 4 four years (month 2 has 29 days).
    - day length of months vary (28 days, 30 days, 31 days).

2. Find Categories.

Parameter   |   Categories
day         |   Value
month       |   length, value
year        |   isLeapYear

3. Identify choices.
Parameter   |   Choices
day         |   value = 1, 28, 29, 30, 31
month       |   length = 28, 29, 30, 31, value = 12  
year        |   year%4 == 0 (isLeapYear)

4. Add Properties and Constraints.
Parameter   |   Choices
day         |   if (value=28 and month=2 and notLeapyear): nextMonth
day         |   if (value=29 and month=2 and leapYear): nextMonth
day         |   if (value=30 and month=4,6,9,11): nextMonth
day         |   if (value=31 and month=1,3,5,7,8,10,12): nextMonth
day         |   else: day + 1
month       |   if (month=12 and day=31): nextYear
year        |   if (year%4 == 0): leapYear = True