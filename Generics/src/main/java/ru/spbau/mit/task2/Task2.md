# Задание №2

Реализуйте класс `NumericBox`: наследника `Box<T>` с дополнительным методом `Double asDouble()`, 
который возвращает хранимое значение, приведенное к типу `Double`. 

Добейтесь, чтобы: 
- реализованный класс был типобезопасным, т.е. никогда не кидал 
`ClassCastException` в runtime, если в программе не использовались raw-типы. 
(см. `Task2Test`)  
*Hint:* см. `java.lang.Number`

- не терял типовой информации: если статически известно, что `NumericBox` хранит 
`Integer`, то `get` должен возвращать `Integer` (см. `Task2Test.shouldGetValueOfStaticallyKnownType`)  
 