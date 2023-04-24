# online-game-service-contest
# PL

Pewna świetna gra online w ostatnim czasie stała się bardzo popularna, a liczba graczy rośnie w szybkim tempie.
Oprócz standardowej rozgrywki, co jakiś czas odbywają się eventy specjalne, na których można zdobyć najwięcej punktów. Każdy gracz chce wziąć w nich udział.
Niestety, platforma na której uruchomiona jest gra, miewa problemy wydajnościowe dlatego wejście na plansze eventu odbywa się grupowo.
W grze można tworzyć klany, stworzone z większej ilości graczy. Siłę klanu definiuje suma punktów członków klanu.
Kolejność wejścia na event specjalny zależy od sumy punktów członków klanu.

Niestety, z powodu wyżej wspomnianych problemów wydajnościowych, wejście na planszę odbywa się zgodnie z poniższymi zasadami:
- gracze wpuszczani są grupami o maksymalnym rozmiarze (m)
- gracze z danej grupy wchodzą na planszę po kolei, a nie w jednym momencie, co oznacza że najlepsi gracze wejdą na serwer pierwsi
- członkowie klanu muszą koniecznie wejść razem w jednej grupie, aby móc korzystać ze swojej najsilniejszej broni, dlatego nie można ich dzielić
- grupy trzeba zoptymalizować w taki sposób, aby wpuszczać jak największą ilość graczy podczas jednego wejścia
- jeśli cała grupa się nie zmieści w danym wejściu, to pierwszeństwo ma kolejna grupa z mniejszą liczbą punktów
- jeśli dwa klany mają taką samą ilość punktów, to większy priorytet ma klan z mniejszą liczbą graczy (co oznacza, że klan ma silniejszych graczy)
- wszystkie klany muszą się dostać na event

## Zadanie
Napisz algorytm, który dla zadanej liczby miejsc w grupie (m) oraz klanów wraz z jej liczebnością (l) i łączną liczbą punktów (p) wyznaczy kolejność oraz układ w jakich gracze powinny wejść na planszę.
Liczba klanów może być naprawdę długa, nawet do 20 000.

Liczby przyjmują wartości zgodnie z poniższymi przedziałami:
m=<1,1000>
l=<1,1000>
p=<1,100 000>

Warunki:
l <= m

# EN
Recently, a fantastic online game has become very popular, and the number of players is growing at a rapid pace. 
In addition to standard gameplay, special events take place from time to time, where players can earn the most points.
Every player wants to participate in them. 
Unfortunately, the platform on which the game is launched sometimes has performance issues, so entry to the event stage takes place in groups. 
In the game, players can create clans made up of a larger number of players. The strength of a clan is defined by the sum of the members' points. 
The order of entry to the special event depends on the sum of the clan members' points.

Unfortunately, due to the aforementioned performance issues, entry to the stage follows the rules below:
- Players are admitted in groups of maximum size (m)
- Players from a particular group enter the stage one by one, not all at once, which means that the best players will enter the server first
- Clan members must necessarily enter together in one group to be able to use their strongest weapon, so they cannot be divided
- Groups need to be optimized in such a way as to admit as many players as possible during a single entry
- If an entire group does not fit in a given entry, the next group with fewer points takes precedence
- If two clans have the same number of points, the clan with fewer players has higher priority (meaning the clan has stronger players)
- All clans must get to the event

## Task
Write an algorithm that, for a given number of seats in a group (m) and clans along with their number of members (l) and total points (p), will determine the order and layout in which players should enter the stage. The number of clans can be really long, even up to 20,000.

The numbers take values according to the following ranges:
m=<1,1000>
l=<1,1000>
p=<1,100,000>

Conditions:
l <= m
