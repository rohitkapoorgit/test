class longestSub():
    
    def longestSubWithoutRep(self, s):
        
        dump = set()
        longest = finalLongest = ""
        for i in range(len(s)):
            
            if s[i] in dump:
                
                dump.clear()
                longest = ""
                
            dump.add(s[i])
            longest = longest + s[i] #or can concatenate using .append in list and then .join
            if len(longest)>len(finalLongest):
                
                finalLongest = longest
        
        return finalLongest,len(finalLongest)
    
test = longestSub()
print(test.longestSubWithoutRep('abcabcbb'))
print(test.longestSubWithoutRep('abcabcbwrwtsrer'))
