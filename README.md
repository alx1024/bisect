* in one terminal run "java Main", if it returns "false" theres a bug
* in another you can bisect by typing:
** "git bisect start"
** "git bisect bad head"
** "git bisect good <some commit you checked out with "git log --oneline" and "git checkout <commit-hash>" from the past where program returns "true">
*** to avoid searching for one you can use the commit hash "4a517f3" so: "git bisect good 4a517f3"
