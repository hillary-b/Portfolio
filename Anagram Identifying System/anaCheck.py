def anagramCheck(firstWord, secondWord):
    if sorted(firstWord) == sorted(secondWord):
        print(firstWord ," and ", secondWord ," is an anagram")
        return True
    else:
        print(firstWord ," and ", secondWord ," is not an anagram")
        return False
    
