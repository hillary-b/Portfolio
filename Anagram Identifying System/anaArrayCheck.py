import anaCheck

listOfStrings = input("Enter a list of words and separate with commas: ")

theList = [word.strip() for word in listOfStrings.split(",")]
setsOfArrays = []
seen = set()


for word in theList:
    if word in seen:
        continue

    tempArray = [word]
    seen.add(word)

    for other_word in theList:
        if other_word != word and other_word not in seen:
            if anaCheck.anagramCheck(word, other_word):
                tempArray.append(other_word)
                seen.add(other_word)  

    if len(tempArray) > 1:
        setsOfArrays.append(tempArray)

print(setsOfArrays)
    
    



