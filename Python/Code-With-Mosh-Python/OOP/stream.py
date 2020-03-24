from abc import ABC, abstractmethod

class InvalidOperationError(Exception):
    pass

# abstract
class Stream(ABC):
    def __init__(self):
        self.opened = False

    def open(self):
        if self.opened:
            raise InvalidOperationError("Already opened")
        else:
            self.opened = True

    def close(self):
        if (not self.opened):
            raise InvalidOperationError("Already closed")
        else:
            self.opened = False
    # When a class have a abstractmethod, it's an abstract class
    @abstractmethod
    def read(self):
        pass

class FileStream(Stream):
    def read(self):
        print("Reading data from a file")

class networkStream(Stream):
    def read(self):
        print("Reading data from a networl")
