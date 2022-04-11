
# EnigmaZadanie2

EnigmaZadanie2 to projekt aplikacji REST API wykorzystującej technologie takie jak:
 Maven, Springboot 2, Lombok.

## Model
Model wykorzystany w aplikacji. Znajduje się on w src/main/java/com.example.rest/model/Location.java

| Nazwa |Typ danych| Opis |
| :---: | :---: | :---: |
|deviceId|long|Przechowuje Id pobrane z telefonu|
|latitiude|int|Przechowuje szerokość geograficzą pobraną z telefonu|
|longitude|int| Przechowuje długość geograficzą pobranną z telefonu|

## REST API

### GET

/api/locations

W odpowiedzi otrzymujemy szystkie wyniki z bazy danych w formacie JSON, oraz status odpowiedzi 200.

/api/locations/{id}

W odpowiedzi otrzymujemy wynik o podanym id w formacie JSON, oraz status odpowiedzi 200.

### POST

/api/locations

Przesyłamy danee w formacie JSON, otrzymujemy status odpowiedzi 200.





