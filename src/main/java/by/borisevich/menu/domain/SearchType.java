package by.borisevich.menu.domain;

/**
 * Created by dima on 7/13/16.
 */


/**
 * Типы поиска
 * (p)  precise     - точный поиск
 * (b)  from begin  - по началу
 * (f)  substring   - полный поиск
 * По умолчанию используется "b"
 * Используется как глобальная переменная на уровне пользовательской сессии??
 */
public enum SearchType {
    p,
    b,
    f
}
