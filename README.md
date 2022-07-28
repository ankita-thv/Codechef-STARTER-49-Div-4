# Codechef-STARTER-49-Div-4

## Problem 1
Chef considers the climate HOT if the temperature is above 2020, otherwise he considers it COLD. You are given the temperature CC, find whether the climate is HOT or COLD.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains a single integer, the temperature CC.
Output Format
For each test case, print on a new line whether the climate is HOT or COLD.

You may print each character of the string in either uppercase or lowercase (for example, the strings hOt, hot, Hot, and HOT will all be treated as identical).

Constraints
1 \leq T \leq 501≤T≤50
0 \leq C \leq 400≤C≤40
Sample 1:
Input
Output
2
21
16
HOT
COLD
Explanation:
Test case 11: The temperature is 2121, which is more than 2020. So, Chef considers the climate HOT.

Test case 22: The temperature is 1616, which is not more than 2020. So, Chef considers the climate COLD.








## Problem 2
Chef is making a dish that consists of exactly two ingredients. He has four ingredients A, B, CA,B,C and DD with tastiness a, b, c,a,b,c, and dd respectively. He can use either AA or BB as the first ingredient and either CC or DD as the second ingredient.

The tastiness of a dish is the sum of tastiness of its ingredients. Find the maximum possible tastiness of the dish that the chef can prepare.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains four space-separated integers a, b, c,a,b,c, and dd — the tastiness of the four ingredients.
Output Format
For each test case, output on a new line the maximum possible tastiness of the dish that chef can prepare.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq a, b, c, d \leq 1001≤a,b,c,d≤100
Sample 1:
Input
Output
2
3 5 6 2
16 15 5 4
11
21
Explanation:
Test case 11: Chef can prepare a dish with ingredients BB and CC with a tastiness of 5+6=115+6=11.

Test case 22: Chef can prepare a dish with ingredients AA and CC with a tastiness of 16+5=2116+5=21.
