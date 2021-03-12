fruit_shop = {
    "apple" : 10,
    "orange": 20,
    "banana": 30,
    "watermelon":50

}

print(fruit_shop)
fruitToCheck=input("what you are looking for ").lower()

if(fruitToCheck in fruit_shop):
    print("Yes This is available :",fruitToCheck)

else:
    print("No This is not available :",fruitToCheck)
