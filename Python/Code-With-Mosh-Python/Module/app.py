from ecommerce.customer import contact
from ecommerce.shopping import sales
import sys
print(sys.path)
# module, map to a file
# package, map to a directory

print(dir(sales))
# name of our module
print(sales.__name__)
# name of the package
print(sales.__package__)
print(sales.__file__)
