print("This wll always run")

def main():
    print(f'First module\'s name:{__name__}')

if __name__ == '__main__':
    main()
    print('run directly')
else:
    print('run from import')
    
