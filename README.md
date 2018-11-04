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

<h1>Használati eset modell</h1>

<h3>Szerepkörök</h3>

    Vendég
    Regisztrált felhasználó
    Admin

![usecaseDiagram](/img/AlkFejlUseCaseDiagram.jpg)

<h1>Tervezés</h1>

<h3>Végpontok</h3>


<ul>
     <li> GET / Főoldal </li>

     <li> POST /register Regisztrálás </li>

     <li> GET /users Tagok listázása </li>

     <li> GET /users/:id Egy tag adatlapja </li>

     <li> PUT /users/:id Egy tag adatainak módosítása </li>

     <li> PUT /users/:id/set-to-owner Egy felhasználó kinevezése tulajdonossá </li>

     <li> DELETE /users/:id Egy tag törlése </li>

     <li> POST /recipes Új recept hozzáadása </li>
 
     <li> GET /recipes Receptek böngészése </li>

     <li> GET /recipes/:id Egy recept adatlapja </li>

     <li> PUT /recipes/:id Recept módosítása </li>

     <li> GET /recipes/:id/comments Recept kommentjeinek listázása </li>

     <li> PUT /recipes/:id/comments Recept kommentjeinek beállítása </li>

     <li> DELETE /recipes/:id Recept törlése </li>

     <li> GET /ingredients Hozzávalók listázása </li>

     <li> GET /ingredients/:id Egy hozzávaló adatlapja </li>

     <li> PUT /ingredients/:id Egy hozzávaló adatainak módosítása </li>

     <li> DELETE /ingredients/:id Szoba törlése </li>
</ul>
