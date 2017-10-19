# amapj

AMPAJ est un outil développé et proposé par [https://github.com/Zinovios/amapj](Zivanios).

Le site de présentation de l'outil est [http://amapj.fr/](http://amapj.fr/).

Le projet a été retravaillé dans le cadre de la Licence Pro de Bayonne.

La [procédure d'installation](http://amapj.fr/docs_technique_install_pc_dev.html) originale a été mise à jour.

### Installation de Java
Vous devez installer Java 8 minimum.

### Installation de Eclipse
```
Créer un répertoire c:\dev-amapj
```
* Visitez la page [Eclipse Download](http://www.eclipse.org/downloads/) pour télécharger Eclipse version Oxygen (Ocotbre 2017).
* Téléchargez la version "Eclipse IDE for Java EE Developers".
* Dezippez l'archive que vous avez téléchargé dans ce répertoire, vous obtenez alors c:\dev-amapj\eclipse\

### Installation de Tomcat
Allez sur la page Tomcat Download pour télécharger la dernière version de Tomcat 7. Télécharger la version "Binary Distributions", Core zip.

Dezippez le contenu de l'archive dans c:\dev-amapj.

```
Vous obtenez alors C:\dev-amapj\apache-tomcat-7.0.64
```

### Telechargement des sources
*Ne pas télécharger les sources depuis la page (Amapj Download)[http://amapj.fr/download.html] mais à partir du repo github*.

Depuis eclipse OXYGEN, affichez la vue Git : Window -> show view -> other -> git repositories.

Un nouveau bouton 'Clone a git repository' apparait dans la fenêtre Git
```
URI : https://github.com/aliceb64/amapj-1
Host : Github.com
RepositoryPath : /aliceb64/amapj-1
```
Faire Next et choisir comme destination l'emplacement de votre workspace C:\dev-amapj\workspace\amap

### Configuration Eclipse / Tomcat
* Lancer Eclipse en double clickant sur C:\dev-amapj\eclipse\eclipse.exe
* Quand Eclipse vous le demande, indiquer pour workspace C:\dev-amapj\workspace
* Faites ensuite File / New ... / Other , puis choisir dans le liste "Server/Server"
* Faites ensuite Next
* Choississez Apache / Tomcat v7.0 Server, puis faire Next
* Faites ensuite Next
* Faites Browse, et indiquez comme chemin C:\dev-amapj\apache-tomcat-7.0.64
* Faites ensuite Next , puis Finish

* Toujours dans Eclipse, aller ensuite dans le menu Windows / Preference
* Aller ensuite dans General / Workspace
* Au niveau de text file encoding, choississez Other UTF-8, puis faire OK

### Mise en place de AspectJ
Vous devez ensuite installer le plug in AspectJ

Dans Eclipse, faites  Help / Install new software

Cliquez ensuite sur Add, mettez ajdt dans Name, puis Name : AspectJ et Location : http://download.eclipse.org/tools/ajdt/46/dev/update

Faites ensuite OK, Select All, décocher bien la case "Contact all update sites during install" puis Next / I Agree / Next / Finish

Faites ensuite OK à la demande de redémarrage de Eclipse

### Création du projet Eclipse
Faites ensuite File / New / Dynamic Web Project

Saisir un nom de projet : amapj

Décochez use default location et mettre chemin jusqu’au repo qui vient d’être cloné (sélectionner le sous-dossier amapj)

Faites ensuite Finish

Faites ensuite clic droit sur le projet amapj, puis sélectionner "Configure", puis "convert to AspectJ project"

IMPORTANT : si vous avez installé le logiciel dans un répertoire différent de c:/dev-amapj, alors il faut éditer le fichier amapj/WebContent/META-INF/context.xml, et remplacer la chaîne de caractère C:/dev-amapj/ par la bonne valeur.

Faites ensuite Project / Clean pour forcer la compilation du projet

Démarrage de l'application
Dans Eclipse, sélectionner le projet amapj, faires clic droit Run As / Run On Server

Faites ensuite Finish

Vous devez alors obtnir le résultat suivant :

 
Vous pouvez alors commencer la visite guidée de l'application en suivant ces instructions : Visite guidée de AmapJ

Comprendre le code de AmapJ
Pour avoir plus d'informations sur le fonctionnement interne de AmapJ , certains détails sont présentés ici : Fonctionnement du code de AmapJ

### Configuration de l'édition des contrats en pdf

SUR LINUX

pour installer wkhtmltopdf , la doc est ici 
http://amapj.fr/docs_technique_install_vps.html
paragraphe "Mise en place de wkhtmltopdf"

Le chemin vers wkhtmltopdf est paramétré dans le fichier amapj.xml,
avec une ligne du style

<Parameter name=“wkhtmltopdf” value=“/usr/bin/wkhtmltopdf.sh”/>

(voir le paragraphe Installation de l'application de la même page http://amapj.fr/docs_technique_install_vps.html)


SUR UNE MACHINE DE DEV WINDOWS

il faut installer wkhtmltopdf de façon classique,

https://wkhtmltopdf.org/downloads.html

normalement il se retrouve après l'install dans C:/Program Files/wkhtmltopdf
ensuite il faut editer le fichier 
/amapj/WebContent/META-INF/context.xml

et ajouter la ligne 
<Parameter name="wkhtmltopdf" value="C:/Program Files/wkhtmltopdf/bin/wkhtmltopdf"  />
