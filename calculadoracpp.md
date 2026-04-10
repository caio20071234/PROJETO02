#include <iostream>

using namespace std;

int main() {
    
// VARIAVEIS

    double num1, num2, result;
    char v;
    
// PRIMEIRO NUMERO

    cout << " Digite um número: ";
    cin >> num1;
    
// PEDE O TIPO DE OPERAÇÃO

    cout << " Digite o tipo de operação: ";
    cin >> v;
    
// VERIFICA QUAL OPERAÇÃO FOI ESCOLHIDA

    switch (v) {
    case '+':
        
    cout << " Digite mais um número: ";
    cin >> num2;
    if(num2 == 0){
        cout << " 0 não vale ";
    }
    else{
    result = num1 + num2;
    cout << " resultado: " << result;
    }
        break;

    case '-':
        
    cout << " Digite mais um número: ";
    cin >> num2;
    if(num2 == 0){
        cout << " 0 não vale ";
    }
    else{
    result = num1 - num2;
    cout << " resultado: " << result;
    }
        break;

    case 'x':
        
    cout << " Digite mais um número: ";
    cin >> num2;
    if(num2 == 0){
        cout << " 0 não vale ";
    }
    else{
    result = num1 * num2;
    cout << " resultado: " << result;
    }
        break;
        
    case '%':
        
    cout << " Digite mais um número: ";
    cin >> num2;
    if(num2 == 0){
        cout << " 0 não vale ";
    }
    else{
    result = num1 / num2;
    cout << " resultado: " << result;
    }
        break;
    default:
       break;
}
}
