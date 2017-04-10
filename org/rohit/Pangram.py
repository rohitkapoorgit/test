class pangram():
    
    def genMissingChars(self, s):
        
        from string import ascii_lowercase
        self.temp = 2
        self.result = set()
        for char in ascii_lowercase:
            
            if not char in s.lower():
                
                self.result.add(char)
             
        
        return ''.join(sorted(self.result))
    
test = pangram()
print(test.genMissingChars("A quick brown fox jumps over the lazy dog"))
print(test.genMissingChars("Four score and seven years ago."))
print(test.genMissingChars(''))
print(test.temp)
print(len(test.result))