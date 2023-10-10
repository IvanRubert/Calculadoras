#!/bin/bash
#Calculadora
function numeros(){
  read -p "Introduce el segundo operador: " num2
}
read -p "Introduce el primer operador: " num1
until [[ $op == "." ]];do
  clear
  echo -e "Elige una opcion:
+ -> suma
- -> resta
* -> multiplicacion
/ -> division
^ -> potencia
sqrt -> raíz cuadrada
log -> logaritmo(10)
logx -> logaritmo(x)
sin -> seno
cos -> coseno
tan -> tangente
. -> salir"
  read -p "¿Que opción quieres hacer? " op
  case $op in
    +)
      numeros
      echo -e "$num1 + $num2 = \c"
      num1=$(echo $num1 + $num2 | bc -l)
      echo "$num1"
    ;;
    -)
      numeros
      echo -e "$num1 - $num2 = \c"
      num1=$(echo $num1 - $num2 | bc -l)
      echo "$num1"
    ;;
    [*])
      numeros
      echo -e "$num1 * $num2 = \c"
      num1=$(echo $num1 \* $num2 | bc -l)
      echo "$num1"
    ;;
    /)
      numeros
      echo -e "$num1 / $num2 = \c"
      num1=$(echo $num1 / $num2 | bc -l)
      echo "$num1"
    ;;
    ^)
      numeros
      echo -e "$num1 ^ $num2 = \c"
      num1=$(echo $num1 ^ $num2 | bc -l)
      echo "$num1"
    ;;
    "sqrt")
      echo -e "sqrt($num1) = \c"
      num1=$(echo "sqrt($num1)" | bc -l)
      echo "$num1"
    ;;
    "log")
      echo -e "log($num1) = \c"
      num1=$(echo "l($num1)/l(10)" | bc -l)
      echo "$num1"
    ;;
    "logx")
      read -p "Introduce el valor del logaritmo: " num2
      echo -e "log($num1) de base $num2 = \c"
      num1=$(echo "l($num1)/l($num2)" | bc -l)
      echo "$num1"
    ;;
    "sin")
      echo -e "sin($num1) = \c"
      num1=$(echo "s($num1)" | bc -l)
      echo "$num1"
    ;;
    "cos")
      echo -e "cos($num1) = \c"
      num1=$(echo "c($num1)" | bc -l)
      echo "$num1"
    ;;
    "tan")
      echo -e "tan($num1) = \c"
      num1=$(echo "s($num1)/c($num1)" | bc -l)
      echo "$num1"
    ;;
    .)
      echo "Has salido"
    ;;
    *)
      echo "Error. Introduce una opcion correcta"
    ;;
  esac
  read -p "Pulsa Enter para continuar: " continuar
done
