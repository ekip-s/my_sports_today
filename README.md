Приложение для начала будет: 
 - записывать информацию о пользователе;
 - записывать тренировки; 
 - отдавать отчет о тренировках; 
***
Модули: 
 - telegram_connection: модуль будет обрабатывать запросы от Телегам и давать ответы;
 - database_writer: модуль telegram_connection --> будет писать запросы в кафку, а эта чать будет читать их и записывать в БД; (здесь скорость записи не очень важна, поэтому будет использоваться кафка)
 - log_info_writer: ловит логи от всех сервисов и пишет в отдельую базу; (тут тоже через кафку)
 - web_app_connection: это самым последним сделаю, сайт с представлением; (авторизация, страницы с тренировками и страницы статистики)
***
Технологии: 
 - Apache Kafka: для связи между модулями; 
 - PostgreSQL: как основная база; 
 - для логов сначала PostgreSQL, а после переключу на Apache Cassandra; (просто, чтобы использовать в проектах разные технологии)
 - Spring Security будет в web_app_connection;