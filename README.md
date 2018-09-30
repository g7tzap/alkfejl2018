<h1>Feladat</h1>

A feladatban egy autentikációhoz kötött recept-gyűjteményt valósítunk meg, ahol van lehetőség regisztrálni, majd a belépés után recepteket böngészni, hozzáadni, illetve lehetőség van a különböző receptek alatt kommentelni is.Az adminisztrációs feladatokat az Admin tudja elvégezni.

<h1>Követelmények</h1>

<h3>Funkcionális követelmények</h3>

    Regisztráció
    Bejelentkezés
    Bejelentkezett felhasználóknak
        Receptek böngészése
        Recept hozzáadása
        Kommentek hozzáfűzése
    Adminnak
        Recept hozzáadása
        Recept szerkesztése
        Recept eltávolítása
        Felhasználó eltávolítása

<h3>Nem funkciónális követelmények</h3>

    Felhasználóbarát felület
    Optimalizáció külöböző böngészőkre
    Autentikációval védett funkciók
    Reszponzív felület


<h1>Szakterületi fogalomjegyzék</h1>

Egy REST API amely Spring Boot segítségével készül el MVC pattern alapján, valamint egy Angular frontend, amely a felhasználói felületet biztosítja, törekszünk az MVVM pattern megtartására. Az adatokat H2 adatbázisban tárljuk a memóriában

