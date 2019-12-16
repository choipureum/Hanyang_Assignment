import random

print('Hello! What is your name?')
myName = input()
print('Well, ' + myName + ', I am thinking of a number between1 and 20.')

number = random.randint(1, 20)
answer = 0;
count= 0

while number != int(answer):
  print('Take a guess')
  answer = input()

 if int(answer) > number:
   print('Your guess is too high')

  elif int(answer) < number:
    print('Your guess is too low')
  elif int(answer) == number:
    print('Good job ,' + myName + '! You Guessed my number in '+ str(count)+'guesses!')
    break

  count += 1

  if count == 6:
    print('You lose. The number is ' + str(number))
    break