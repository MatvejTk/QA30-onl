package hometasks.lesson7;

public class Main {
}
// Основное задание
//  1. Класс Phone.
//  Создайте класс Phone, который содержит переменные number, model и weight.
//  Создайте три экземпляра этого класса.
//  Выведите на консоль значения их переменных.
//  Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//  Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
//  Вызвать эти методы для каждого из объектов.
//  Добавить конструктор в класс Phone,
//  который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//  Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//  Добавить конструктор без параметров.
//  Вызвать из конструктора с тремя параметрами конструктор с двумя.
//  Добавить перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
//  Вызвать этот метод.
//  Создать метод sendMessage с аргументами переменной длины.
//  Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
//  Метод выводит на консоль номера этих телефонов.

//  Дополнительное задание
//  2. Создать программу для имитации работы клиники.
//  Пусть в клинике будет три врача: хирург, терапевт и дантист.
//  Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
//  Так же предусмотреть класс «Пациент» и класс «План лечения».
//  Создать объект класса «Пациент» и добавить пациенту план лечения.
//  Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
//  Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//  Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//  Если план лечения имеет любой другой код – назначить выполнить метод лечить.
/*
    Создаем класс Клиника
    Создаем класс врач
    доктор - метод лечить
    переписать под других врачей
    if broke bounce then operation if illness then check-up if teeth pain then teeth clean
    if surgeon (Operation) else if therapist (Check-up) else if dentist (Teeth clean) else (You inserted wrong number)
    пациент if 1 then operation if 2 then check-up if 3 then teeth clean
 */