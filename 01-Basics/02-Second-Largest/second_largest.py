arr = [10, 5, 8, 10, 3, 7]

largest = float('-inf')
second_largest = float('-inf')

for i in arr:
    if i > largest:
        second_largest = largest
        largest = i
    elif i > second_largest and i != largest:
        second_largest = i

print("Second Largest Element:", second_largest)
