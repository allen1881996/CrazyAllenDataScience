class tagCloud:
    def __init__(self):
        # tags is a dict
        self.__tags = {}

    def __getitem__(self, tag):
        return self.__tags.get(tag.lower(), 0)

    def __setitem__(self, tag, count):
        self.__tags[tag.lower()] = count

    def __len__(self):
        return len(self.__tags)

    def add(self, tag):
        # tag is the key
        # if tag is not in tags, default is 0
        self.__tags[tag.lower()] = self.__tags.get(tag.lower(), 0) + 1

    def __iter__(self):
        return iter(self.__tags)


cloud = tagCloud()
cloud.add("python")
cloud.add("python")
cloud.add("Python")
# print(cloud.__tags)
print(cloud["python"])
cloud["Python"] = 5
# print(cloud.__tags, len(cloud))

for tag in cloud:
    print(tag)

print(cloud.__dict__)
# __tag is private, but not secure, we can still access it
print(cloud._tagCloud__tags)
