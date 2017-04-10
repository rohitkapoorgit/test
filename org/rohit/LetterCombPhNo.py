class letterPhNo:
   
    def letterCombinations(self, digits):
        
        mapping = ["0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]
        result = [""]
        for i in digits:
            
            digit = mapping[int(i)]
            newresult = []
            for char in digit:
                
                for x in result:
                    
                    newresult.append(x+char)
                    
            result = newresult
            
        return result
    
test = letterPhNo()
print(test.letterCombinations("23"))