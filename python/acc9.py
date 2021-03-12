

list1 = [1,2,3,5,7,8,10]
list2 = [2,4,6,8,10,14,18,19]

print("First list", list1)
print("First list", list2)

list3 =[]
#Odd number
for num in list1:
    if(num  % 2 !=0):
        list3.append(num)

#Even number
for num in list2:
    if(num%2==0):
         list3.append(num) 


print(list3)      

