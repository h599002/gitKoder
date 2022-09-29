import random
import time

print("\nVelkommen til Hangman!\n")
name = input("Hva heter du?: ")
print("Hallo " + name + "! Lykke til!")
time.sleep(2)

def main():
    global count
    global allerede_gjettet
    global ord
    global length
    global display
    ord_a_gjette = ["Januar", "Kake", "Sko", "På", "Byggjævel"] # Legg til de ordene du ønsker
    ord = random.choice(ord_a_gjette)
    length = len(ord)
    count = 0
    display = '_' * length
    allerede_gjettet = []
    hangman()

def hangman():
    global count
    global display
    global ord
    global allerede_gjettet
    liv = 5
    gjett = input("Dette er ordet ditt: " + display + " Skriv en bokstav: \n")
    gjett = gjett.strip()
    if len(gjett.strip()) == 0 or len(gjett.strip()) >= 2 or gjett <= "9":
        print("Ugyldig input, prøv en bokstav\n")
        hangman()


    elif gjett.lower() in ord.lower():

        # Setter både 'gjett' og 'ord' til små bokstaver sånn at det er enklere å sammenligne
        # Slipper også da å skrive '.lower()' hver gang man bruker 'ord' eller 'gjett'
        gjett = gjett.lower()
        ord = ord.lower()

        allerede_gjettet.extend([gjett])
        index = ord.find(gjett)
        ord = ord[:index] + "_" + ord[index + 1:]

        # Hvis bokstaven som ble gjetta er første bokstaven, så blir den printet som stor bokstav
        if index == 0: 
            display = display[:index] + gjett.upper() + display[index + 1:]
        else: 
            display = display[:index] + gjett.lower() + display[index + 1:]

        print(display + "\n")
        if gjett in ord:
            index = ord.find(gjett)
            ord = ord[:index] + "_" + ord[index + 1:]
            display = display[:index] + gjett + display[index + 1:]

    elif gjett in allerede_gjettet:
        print("Allerede tippa. Prøv på nytt.\n")
    else:
        count += 1

        if count == 1:
            time.sleep(1)
            print("   _____ \n"
                  "  |      \n"
                  "  |      \n"
                  "  |      \n"
                  "  |      \n"
                  "  |      \n"
                  "  |      \n"
                  "__|__\n")
            print("Feil. " + str(liv - count) + " forsøk igjen\n")

        elif count == 2:
            time.sleep(1)
            print("   _____ \n"
                  "  |     | \n"
                  "  |     |\n"
                  "  |      \n"
                  "  |      \n"
                  "  |      \n"
                  "  |      \n"
                  "__|__\n")
            print("Feil. " + str(liv - count) + " forsøk igjen\n")

        elif count == 2:
            time.sleep(1)
            print("   _____ \n"
                  "  |     | \n"
                  "  |     |\n"
                  "  |     |\n"
                  "  |      \n"
                  "  |      \n"
                  "  |      \n"
                  "__|__\n")
            print("Feil. " + str(liv - count) + " forsøk igjen\n")

        elif count == 4:
            time.sleep(1)
            print("   _____ \n"
                  "  |     | \n"
                  "  |     |\n"
                  "  |     | \n"
                  "  |     O \n"
                  "  |      \n"
                  "  |      \n"
                  "__|__\n")
            print("Feil. " + str(liv - count) + " forsøk igjen\n")

        elif count == 5:
            time.sleep(1)
            print("   _____ \n"
                  "  |     | \n"
                  "  |     |\n"
                  "  |     | \n"
                  "  |     O \n"
                  "  |    /|\ \n"
                  "  |    / \ \n"
                  "__|__\n")
            print("Feil. Du blei hengt! \n")
            print("Ordet var:",allerede_gjettet,ord)

            spillpånytt()

    if ord == '_' * length:
        print("Gratulerer! Du gjetta riktig!")
        spillpånytt()

    elif count != liv:
        hangman()

def spillpånytt(): 
    svar = input("Da var du ferdig! Vil du spille på nytt?")

    if svar.lower() == "ja":
        print("\n laster")

        # Kun for gøy :)
        for i in range(6):
            print("." * i)
            time.sleep(1)
            if i == 5:
                print("\n")

        main() # Starter programmet på nytt

    elif svar.lower() == "nei":
        exit()
    else:
        print("Du må skrive enten 'ja' eller 'nei'.")
        spillpånytt()

main() # Starter programmet innledningsvis

