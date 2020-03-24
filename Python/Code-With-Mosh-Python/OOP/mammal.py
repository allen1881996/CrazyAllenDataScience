# DRY: Don't repeat yourself
class Animal:  # Parent, base class
    def __init__(self):
        self.age = 1

    def eat(self):
        print("eat")


class Mammal(Animal):  # child, sub class
    # method overide, replace the constructor in Animal class
    def __init__(self):
        self.weight = 2

    def walk(self):
        print("walk")


class Fish(Animal):
    def __init__(self):
        super().__init__()
        self.weight = 3

    def swim(self):
        print("swim")


m = Mammal()
# print(m.age)
print(isinstance(m, Mammal))
print(isinstance(m, Animal))
print(issubclass(Mammal, object))  # indirectly derived from object class
f = Fish()
print(f.age, f.weight)
