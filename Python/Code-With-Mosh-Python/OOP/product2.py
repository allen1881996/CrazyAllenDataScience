class Product:
    def __init__(self, price):
        self.price = price

    @property
    def price(self):
        return self.price

    @price.setter
    def price(self, price):
        if price < 0:
            raise ValueError("Cannot be negative")
        else:
            self.price = price

    # get func, set func, del func, doc
    # price = property(get_price, set_price)
product = Product(-1)
