USE `surveys_db`;

insert into `surveys`(NAME, DESCR, CRTTIME, CRTUSER) 
	values('Testeaza-ti capacitatea de concentrare', '', '2016-01-08 18:34:35', 'admin');
insert into `surveys`(NAME, DESCR, CRTTIME, CRTUSER) 
	values('Satisfactie clienti servicii RCS-RDS', '', '2016-01-28 14:34:00', 'admin');
insert into `surveys`(NAME, DESCR, CRTTIME, CRTUSER)
	values('Chestionar pentru elevi', '', '2016-01-30 14:34:00', 'admin');
insert into `surveys`(NAME, DESCR, CRTTIME, CRTUSER)
	values('Studiu privind consumul de vin', '', '2016-01-30 14:34:00', 'admin');    
select * from surveys;

#questions for survey 1
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ceilalti ma intrerup tot timpul.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Atunci cand sunt intrerupt imi este greu sa revin la ceea ce faceam.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Atunci cand cineva ma intrerupe imi este greu sa-i spun sa ma lase sa revin la ceea ce lucram.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Mi se intampla frecvent sa imi fie distrasa atentia.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Imi este greu sa ma concentrez.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Deseori le cer celorlalti sa repete ce au spus', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Visez mult cu ochii deschisi.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('La sfarsitul zilei ma simt adesea frustrat, deoarece nu am reusit sa duc ceva pana la capat.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ma simt adesea imprastiat si ineficient.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Cand cineva vine in biroul meu se simte foarte confortabil.', 'SELECT_ONE', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);

#questions for survey 2
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Alegeti serviciile contractate de la RCS-RDS', 'SELECT_MULTIPLE', 
    'Internet;Televiziune;Telefonie fixa;Telefonie mobila', '2016-01-28 14:34:00', 'admin', 2);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ati intampinat probleme la instalarea serviciilor? Daca da va rugam detaliati.', 'FREE_TEXT', 
    null, '2016-01-28 14:34:00', 'admin', 2);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('In cazul in care ati intampinat probleme in utilizarea serviciilor care a fost frecventa acestora?', 'SELECT_ONE', 
    'Deloc;Saptamanal;Lunar;Zilnic', '2016-01-28 14:34:00', 'admin', 2);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce pasi ati urmat daca serviciul/serviciile contractate de dumneavoastra nu a/au functionat la parametri contractati?', 'SELECT_MULTIPLE', 
    'Ati sunat la Call Center;Ati sunat la responsabilul de contract;Ati trimis mail la adresa de suport;Ati asteptat remedierea fara a intreprinde nici o actiune', 
     '2016-01-28 14:34:00', 'admin', 2); 
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Cum apreciati calitatea asistentei tehnice oferite de RCS-RDS?', 'SELECT_ONE', 
    'Foarte buna;Buna;Slaba', '2016-01-28 14:34:00', 'admin', 2);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ati recomanda serviciile RCS-RDS?', 'SELECT_ONE', 
    'Da;Nu;Poate', '2016-01-28 14:34:00', 'admin', 2);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Daca aveti propuneri de imbunatatire a serviciilor va rugam sa detaliati.', 'FREE_TEXT', 
    null, '2016-01-28 14:34:00', 'admin', 2);

#questions for survey 3
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Varsta', 'FREE_TEXT', null, '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Domiciliul', 'SELECT_ONE', 'Urban;Rural', '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Considerati ca aveti acces catre toate spatiile de instruire si educatie?', 'SELECT_ONE', 
    'Da;Nu;Acces limitat', '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce considerati ca este important pentru profesori in evaluarea elevilor?', 'SELECT_MULTIPLE', 
    'Initiativa;Creativitatea;Logica;Acuratetea informatiei;Abilitati de comunicare', 
    '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce calitati apreciezi la profesorii tai?', 'FREE_TEXT', null, '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Aranjati in ordine crescatoare urmatoarele cauze ale conflictului elev-profesor: evaluarea, 
    antipatia fata de profesor, indisciplina, modul de comunicare al profesorului', 'FREE_TEXT', 
    null, '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce competente ar trebui sa aiba un reprezentat in consiliul elevilor?', 'SELECT_MULTIPLE', 
    'Sa aiba initiativa;Sa aiba abilitati de comunicare si decizionale;Sa fie bun la invatatura', 
    '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce apreciezi in primul rand la scoala ta?', 'SELECT_ONE', 
    'Activitatea de predare;Relatiile cu profesorii;Relatiile cu elevii;Pregatirea pentru viata', 
    '2016-01-30 14:34:00', 'admin', 3);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce te nemultumeste in primul rand la scoala ta?', 'SELECT_ONE', 
    'Calitatea predarii;Baza materiala a scolii;Regulamentul de ordine interiora', 
    '2016-01-30 14:34:00', 'admin', 3);    

#questions for survey 4
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ati achizitionat vin imbuteliat de pe piata in ultimele luni?', 'SELECT_ONE', 'Da;Nu', 
    '2016-01-15 14:34:00', 'admin', 4);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce fel de vin?', 'SELECT_MULTIPLE', 'Sec;Demisec;Demidulce;Dulce', '2016-01-15 14:34:00', 'admin', 4);    
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Care sunt soiurile/marcile de vin pe care le cunoasteti pana in prezent?', 'FREE_TEXT', null, 
    '2016-01-15 14:34:00', 'admin', 4);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Pentru ce soiuri/marci de vin ati vazut recent reclama pe posturile de televiziune?', 'FREE_TEXT', 
    null, '2016-01-15 14:34:00', 'admin', 4);    
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce ambalaj preferati?', 'SELECT_ONE', 'Pet;Sticla de 0.75L;Sticla de 1L;Sticla de 2L', 
    '2016-01-15 14:34:00', 'admin', 4); 
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Care a fost frecventa de cumparare in ultimele luni?', 'SELECT_ONE', 
    'Zilnic;De 2-3 pe saptamana;O data pe saptamana;De 2-3 ori pe luna;O data pe luna;Mai rar', 
    '2016-01-15 14:34:00', 'admin', 4); 
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Ce cantitate de vin achizitionati la o singura cumparatura?', 'SELECT_ONE', 
    'O sticla de 0.75L;1L;2-3L;Mai mult de 3L', '2016-01-15 14:34:00', 'admin', 4); 
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Care este locul preferat de achizitionare a vinului?', 'SELECT_ONE', 
    'Supermarket;Magazin specializat;Magazine mici', '2016-01-15 14:34:00', 'admin', 4);
insert into `questions` (TXT, QTYPE, ANS, CRTTIME, CRTUSER, SURVEY)
	values('Care este pretul pe care sunteti dispus sa il platiti pentru o sticla de 0.75L?', 'SELECT_ONE', 
    'Sub 10 lei;10-20 lei;20-40 lei;Peste 40 lei', '2016-01-15 14:34:00', 'admin', 4);     
select * from `questions`;

insert into `survey_results`(CRTTIME, CRTUSER, SURVEY) values('2016-01-08 18:50:35', 'ovi', 1);
insert into `survey_results`(CRTTIME, CRTUSER, SURVEY) values('2016-01-10 18:50:35', 'ovi', 2);
insert into `survey_results`(CRTTIME, CRTUSER, SURVEY) values('2016-01-11 18:50:35', 'ovi', 2);
insert into `survey_results`(CRTTIME, CRTUSER, SURVEY) values('2016-01-30 13:50:35', 'ovi', 3);
insert into `survey_results`(CRTTIME, CRTUSER, SURVEY) values('2016-01-16 13:50:35', 'ovi', 4);
select * from `survey_results`;

#answers for survey_results 1
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Mai mult fals', '2016-01-08 18:50:35', 'ovi', 1, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Destul de adevarat', '2016-01-08 18:50:35', 'ovi', 2, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Total fals', '2016-01-08 18:50:35', 'ovi', 3, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Total adevarat', '2016-01-08 18:50:35', 'ovi', 4, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Destul de adevarat', '2016-01-08 18:50:35', 'ovi', 5, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Destul de adevarat', '2016-01-08 18:50:35', 'ovi', 6, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Mai mult fals', '2016-01-08 18:50:35', 'ovi', 7, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Mai mult fals', '2016-01-08 18:50:35', 'ovi', 8, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Mai mult fals', '2016-01-08 18:50:35', 'ovi', 9, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Mai mult fals', '2016-01-08 18:50:35', 'ovi', 10, 1);

#answers for survey_results 2
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Internet;Televiziune', '2016-01-10 18:50:35', 'ovi', 11, 2);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Nu', '2016-01-10 18:50:35', 'ovi', 12, 2);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Lunar', '2016-01-10 18:50:35', 'ovi', 13, 2);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Ati sunat la Call Center', '2016-01-10 18:50:35', 'ovi', 14, 2);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Buna', '2016-01-10 18:50:35', 'ovi', 15, 2);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Da', '2016-01-10 18:50:35', 'ovi', 16, 2);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Momentan sunt multumit de serviciile oferite', '2016-01-10 18:50:35', 'ovi', 17, 2);
    
#answers for survey_results 3
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Televiziune', '2016-01-10 18:50:35', 'ovi', 11, 3);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Echipamentul a fost instalat cu o intarziere de trei zile', '2016-01-10 18:50:35', 'ovi', 12, 3);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Deloc', '2016-01-10 18:50:35', 'ovi', 13, 3);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Ati asteptat remedierea fara a intreprinde nici o actiune', '2016-01-10 18:50:35', 'ovi', 14, 3);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Buna', '2016-01-10 18:50:35', 'ovi', 15, 3);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Da', '2016-01-10 18:50:35', 'ovi', 16, 3);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Promptitudine mai mare a echipelor care asigura montajul', '2016-01-10 18:50:35', 'ovi', 17, 3);
    
#answers for survey_results 4
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('15', '2016-01-30 13:50:35', 'ovi', 18, 4);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Urban', '2016-01-30 13:50:35', 'ovi', 19, 4);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Da', '2016-01-30 13:50:35', 'ovi', 20, 4);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Initiativa;Logica', '2016-01-30 13:50:35', 'ovi', 21, 4);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Rabdarea si devotamentul', '2016-01-30 13:50:35', 'ovi', 22, 4);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('indisciplina, antipatia fata de profesor, evaluarea, modul de comunicare al profesorului', 
    '2016-01-30 13:50:35', 'ovi', 23, 4);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Sa aiba initiativa;Sa aiba abilitati de comunicare si decizionale', '2016-01-30 13:50:35', 'ovi', 24, 4);    
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Relatiile cu profesorii', '2016-01-30 13:50:35', 'ovi', 25, 4);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Baza materiala a scolii', '2016-01-30 13:50:35', 'ovi', 26, 4);

#answers for survey_results 5
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Da', '2016-01-16 13:50:35', 'ovi', 27, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Demidulce', '2016-01-16 13:50:35', 'ovi', 28, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Cotnari, Domeniile Boieru, Murfatlar', '2016-01-16 13:50:35', 'ovi', 29, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Murfatlar cabernet sauvignon', '2016-01-16 13:50:35', 'ovi', 30, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Sticla de 0.75L', '2016-01-16 13:50:35', 'ovi', 31, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('De 2-3 ori pe luna', '2016-01-16 13:50:35', 'ovi', 32, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('2-3L', '2016-01-16 13:50:35', 'ovi', 33, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Supermarket', '2016-01-16 13:50:35', 'ovi', 34, 5);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('10-20 lei', '2016-01-16 13:50:35', 'ovi', 35, 5);
select * from `completed_answers` 