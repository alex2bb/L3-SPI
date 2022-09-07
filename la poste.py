liste = ["lettre verte", "lettre prioritaire", "ecopli", "eco outre-mer"]

choix = int(input("Quel est votre type de lettre ?\n 1 : lettre verte \n 2 : lettre prioritaire \n 3 : ecopli \n 4 : eco outre-mer \n entrez le numéro correspond : "))

if choix == 1:
    lettre = liste[0]
elif choix == 2:
    lettre = liste[1]
elif choix == 3:
    lettre = liste[2]
elif choix == 4:
    lettre = liste[3]

print("\n vous avez choisi :", lettre,"\n ") 

poids = int(input("Inserez le poids de votre colis en grammes : "))

if lettre == liste[0]:
    if poids <= 20:
        prix = 1.16
    elif 20 < poids <= 100:
        prix = 2.32  
    elif 100 < poids<= 250:
        prix = 4
    elif 250 < poids<= 500:
        prix = 6
    elif 500 < poids<= 1000:
        prix = 7.50
    elif 1000 < poids<= 3000:
        prix = 10.50 
    else : 
        print("désolé je n'ai pas compris")

if lettre == liste[1]:
    if poids <= 20:
        prix = 1.43
    elif 20 < poids <= 100:
        prix = 2.86
    elif 100 < poids<= 250:
        prix = 5.26
    elif 250 < poids<= 500:
        prix = 7.89
    else : 
        print("désolé je n'ai pas compris")

if lettre == liste[2]:
    if poids <= 20:
        prix = 1.14
    elif 20 < poids <= 100:
        prix = 2.28
    elif 100 < poids<= 250:
        prix = 3.9
    else : 
        print("désolé je n'ai pas compris")

if lettre == liste[3]:
    if poids <= 500:
        prix = 8.35
    elif 500 < poids <= 1000:
        prix = 11.2
    elif 1000 < poids<= 2000:
        prix = 14.1
    elif 2000 < poids <= 5000:
        prix = 23.65
    elif 5000 < poids<= 10000:
        prix = 37.5
    elif 10000 < poids <= 15000:
        prix = 75.85
    elif 15000 < poids<= 30000:
        prix = 87.4
    else : 
        print("désolé je n'ai pas compris")

print ("en résumé avec un type de lettre : ", lettre,"\net un poids de ",poids, "grammes \nle cout de votre envoie s'elevera à : ", prix, "€")