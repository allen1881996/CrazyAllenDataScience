class Product:
    def __init__(self, price):
        self.__set_price(price)

    def __get_price(self):
        return self.__price

    def __set_price(self, price):
        if price < 0:
            raise ValueError("Cannot be negative")
        else:
            self.__price = price


# we don't want negative value
product = Product(-40)
# the first way is, using a get and set method
