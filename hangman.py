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
    ord_a_gjette = ["england", "sko", "byggjævel"] # Legg til de ordene du ønsker
    # Programmet er case-sensitivt, så hvis man skriver et ord med stor forbokstav så må man tippe stor forbokstav
    ord = random.choice(ord_a_gjette)
    length = len(ord)
    count = 0
    display = '_' * length
    allerede_gjettet = []

def hangman():
    global count
    global display
    global ord
    global allerede_gjettet
    liv = 5
    gjett = input("Dette er ordet ditt: " + display + " Skriv en bokstav (kun små bokstaver): \n")
    gjett = gjett.strip()
    if len(gjett.strip()) == 0 or len(gjett.strip()) >= 2 or gjett <= "9":
        print("Ugyldig input, prøv en bokstav\n")
        hangman()


    elif gjett in ord:
        allerede_gjettet.extend([gjett])
        index = ord.find(gjett)
        ord = ord[:index] + "_" + ord[index + 1:]
        display = display[:index] + gjett + display[index + 1:]
        print(display + "\n")

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

    if ord == '_' * length:
        print("Gratulerer! Du gjetta riktig!")

    elif count != liv:
        hangman()

main()

hangman()
