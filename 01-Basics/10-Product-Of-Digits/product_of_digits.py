num = 12345
product = 1

while num > 0:
    rem = num % 10
    product *= rem
    num = num // 10

print("Product of Digits:", product)