# The name of class use pascal convention: Uppercase, No underscore
class Point:
    # class level attribute: shared arross all object
    default_color = "red"
    # constructor
    # self reference to the object

    # magic mathod with __,called automatically by the interpreter

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x},{self.y})"

    def __eq__(self, other):
        return (self.x == other.x) & (self.y == other.y)

    def __gt__(self, other):
        return (self.x > other.x) & (self.y > other.y)

    def __add__(self, other):
        return Point(self.x + other.x, self.y + other.y)

    # every method must have at least one parameter

    def draw(self):
        print(f"Point ({self.x},{self.y})")

    # cls is a convention, reference to a class
    @classmethod
    def zero(cls):
        return cls(0, 0)


point1 = Point(1, 9)
point1.draw()
print(type(point1))
# If this object is cotained in this class
print(isinstance(point1, Point))
print(point1.x)
point1.x = 10
print(point1.x)
# what if we change the class attirbute via object
point1.default_color = 'blue'
print(Point.default_color)
print(point1.default_color)
point2 = Point(3, 5)
print(point2.default_color)
point3 = Point.zero()
print(point1, point2, point3)
point4 = Point(0, 0)
print(point3 == point4)
print(point1 > point3)
# python can automatically figure out what to do if you use "<"
print(point1 < point2)
point5 = point1 + point2
print(point5)
