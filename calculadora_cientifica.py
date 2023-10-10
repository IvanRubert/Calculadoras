import os
import math
def suma(x, y):
  return x + y
def resta(x, y):
  return x - y
def multiplicar(x, y):
  return x * y
def dividir(x, y):
  if y == 0.0:
    return "Error"
  else:
    return x / y
def potencia(x, y):
  return x ** y
def raiz_cuadrada(x):
  return x ** 0.5
def factorial(x):
  if x == 0:
    return 1
  else:
    return x * factorial(x - 1)
def logaritmo_10(x):
  return math.log10(x)
def logaritmo(x, y):
  return math.log(y, x)
def seno(x):
  return math.sin(x)
def coseno(x):
  return math.cos(x)
def tangente(x):
  return math.tan(x)
def main():
  while True:
    os.system('cls')
    print("+ -> Suma")
    print("- -> Resta")
    print("* -> Multiplicar")
    print("/ -> Dividir")
    print("^ -> Potencia")
    print("sqrt -> Raiz cuadrada")
    print("! -> Factorial")
    print("log -> Logaritmo(10)")
    print("logx -> Logaritmo(x)")
    print("sin -> Seno")
    print("cos -> Coseno")
    print("tan -> Tangente")
    print(". -> Salir")
    choice = input("Escoje una opcion: ")
    if choice == "+":
      x = float(input("Introduce el primer numero: "))
      y = float(input("Introduce el segundo numero: "))
      print(x, "+", y, "=", suma(x, y))
    elif choice == "-":
      x = float(input("Introduce el primer numero: "))
      y = float(input("Introduce el segundo numero: "))
      print(x, "-", y, "=", resta(x, y))
    elif choice == "*":
      x = float(input("Introduce el primer numero: "))
      y = float(input("Introduce el segundo numero: "))
      print(x, "*", y, "=", multiplicar(x, y))
    elif choice == "/":
      x = float(input("Introduce el primer numero: "))
      y = float(input("Introduce el segundo numero: "))
      print(x, "/", y, "=", dividir(x, y))
    elif choice == "^":
      x = float(input("Introduce la base: "))
      y = float(input("Introduce el exponente: "))
      print(x, "^", y, "=", potencia(x, y))
    elif choice == "sqrt":
      x = float(input("Introduce el numero: "))
      print("√(",x,") =", raiz_cuadrada(x))
    elif choice == "!":
      x = int(input("Introduce el numero: "))
      print(x,"!", factorial(x))
    elif choice == "log":
      x = int(input("Introduce el numero: "))
      print("log(",x,") =", logaritmo_10(x))
    elif choice == "logx":
      x = int(input("Introduce la base del logaritmo: "))
      y = int(input("Introduce el numero: "))
      print("log(",y,") de base", x, "=", logaritmo(x, y))
    elif choice == "sin":
      x = int(input("Introduce el numero: "))
      print("sin(",x,") =", seno(x))
    elif choice == "cos":
      x = int(input("Introduce el numero: "))
      print("cos(",x,") =", coseno(x))
    elif choice == "tan":
      x = int(input("Introduce el numero: "))
      print("tan(",x,") =", tangente(x))
    elif choice == ".":
      break
    else:
      print("Error. Opcion incorrecta")
    continuar = input("Pulsa Enter para continuar: ")
if __name__ == "__main__":
  main()
