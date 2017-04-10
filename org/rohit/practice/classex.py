
class MyClass():

    def test(self, param1, param2):
        
        self.result = param1 + param2
        return self.result


def main():
    
    print("2nd")    
    a = MyClass()
    print("3rd")
    print(a.test(2,3))
    
        
if __name__ == '__main__':
    print("Starts here")
    main()
    
        