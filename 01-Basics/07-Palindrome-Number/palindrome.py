original = 12321
num = original
reversed_num = 0

while num > 0:
    rem = num % 10
    reversed_num = reversed_num * 10 + rem
    num = num // 10

if original == reversed_num:
    print("Palindrome")
else:
    print("Not Palindrome")