# Ternay Operator
from timeit import timeit
from array import array
age = 12
message = "I love you" if age >= 10 else "I don't"
print(message)

# Chaining Comparsion Operators
if 10 < age <= 15:
    print("yes")

# xargs and xxargs


def mutiply(*numbers):
    total = 1
    for number in numbers:
        total *= number
    print(total)


mutiply(1, 2, 3, 4, 5)

# Unpack operator (Unpack any iterable object)
number = [1, 2, 3, 4]
print(*number)
num_list = [*range(10), *"hello"]
print(num_list)

# List Unpacking
first, second, _ = [1, 2, 3]
print(first, second)
first, second, *others = [1, 2, 3, 4, 5]
print(first, second, others)  # here, others is a list
num_dict1 = {"x": 2, "y": 3}
num_dict2 = {"z": 3, "x": 4}
num_dict = {**num_dict1, **num_dict2}
print(num_dict)

# Swapping Variables
x = 2
y = 3
x, y = y, x
print(f"x is {x},y is {y}")

# Arrays
arr = array("i", [1, 2, 3, 4])
arr.append(2)
arr.pop()
print(arr)

# timeit
code = """
list1 = [1,2,3,4]
for i in list1:
    i *= 2
"""
print(timeit(code, number=100))
