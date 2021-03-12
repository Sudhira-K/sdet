
	numbers = list(input("Enter a sequence of comma separated values: ").split(","))
#numbers1 =[1,3,4,5,4,17]
sum = 0
 
for number in numbers:
  sum += int(number)
 
print(sum)