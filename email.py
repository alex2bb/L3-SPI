""" def full_name(x):
    x = x.split()
    print(x)
    nom = x[0].upper()
    prenom = x[1].capitalize()
    identite = nom + " " + prenom
    return identite
nomprenom = "rech alex"

print(full_name(nomprenom)) """

def is_mail(mail):
    mail = mail.lower()
    mail_decoupe = mail.split('@')
    if len(mail_decoupe) == 2: # verification de la presence du @
        resultat = (1, 0)
        for char in mail_decoupe[0]:
            if not 97<= ord(char) <= 122 and not 48<= ord(char) <= 57: #verification si le corps du mail contient uniquement des lettres de A à Z
                return (0, 1)
        if not "." in mail_decoupe[1]:#verification de la presence du point
            return (0, 4)
        for char in mail_decoupe[1]:
            if mail_decoupe[1][0] == ".":#verif de si le premier char est "." 
                return (0, 3)
            if 45 != ord(char)  and 46 != ord(char) and not (97<= ord(char) <= 122) :#
                return (0, 3)#verif da la validité du nom de domaine
    else:
        return (0, 2)
    return resultat

email = "alexandre2b@gm.com"


print(is_mail(email))