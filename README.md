# Втора лабораториска вежба по Софтверско инженерство

## Ана Терзиева, бр.на индекс 213070

### Control Flow Graph
![CFG.png](CFG.png)


### Цикломатска комплексност
#### Цикломатската комплексност на овој граф е 11.
#### Графот има 10 опкружени региони, броејќи го надворешниот, има 11 региони.
#### Графот има 10 предикатни јазли,се додава +1, па така цикломатската комплексност е 11.
#### Според број на јазли и ребра:
* V = E(edges) - N(nodes) + 2.
* V = 31 - 22 + 2 = 11

### Тест случаи според критериумот Every statement

### Тест 1. 
* Според напишаниот ЦФГ, тука ги опфаќаме патеките 1.1-1.2, 1.2-3.4. Со што се фрла exception и завршува програмата.
  
### Тест 2.
*  Во овој тест, праќаме null вредност за корисничко име, и испраќаме лозинка и мејл соодветно. Поради тоа што лозинката го фаќа условот од јазол 2.7 и продолжува во 2.8 ќе терминира со return false. 

### Тест 3.
*  Со овој тест покриваме најголем дел од Every branch методот, испраќаме коректна лозинка мејл а исто така и корисничкото име ќе се сетира со вредноста од мејл адресата. Само 8 од 29 патеки нема да бидат опфатени во третиот тест. 

### Тест 4.
*  Последниот тест го користиме за опфаќање на останатите 6 патеки со кои што го заокружуваме целосното тестирање на Every Branch методот. 

### Тест случаи според критериумот Multiple Condition

### Тест 1. 
*  Овој тест проверува дали методот SILab2.function враќа false кога user објектот има null вредност за името (user.name) и кога во userList има корисници (User) коишто содржат null вредност за името. Очекувано е да врати false, бидејќи условот за null име е исполнет.

### Тест 2.
*  Овој тест проверува дали методот SILab2.function враќа false кога user објектот има исто име со некој корисник (User) од userList, но со различна вредност за лозинката (user.password). Очекувано е да врати false, бидејќи условот за различна вредност на лозинката е исполнет.

### Тест 3.
*  Овој тест проверува дали методот SILab2.function враќа false кога user објектот има null вредност за името (user.name) и кога во userList има корисници (User) коишто содржат специјални знаци (!) во лозинката (user.password). Очекувано е да врати false, бидејќи условот за специјални знаци во лозинката е исполнет.


