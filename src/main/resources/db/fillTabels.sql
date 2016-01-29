USE `surveys_db`;

insert into `surveys`(NAME, DESCR, CRTTIME, CRTUSER) 
	values('Testeaza-ti capacitatea de concentrare', '', '2016-01-08 18:34:35', 'admin');
insert into `surveys`(NAME, DESCR, CRTTIME, CRTUSER) 
	values('Satisfactie clienti servicii RCS-RDS', '', '2016-01-28 14:34:00', 'admin');
select * from surveys;

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
    'Ati sunat la Call Center;Ati sunat la responsabilul de contract;
     Ati trimis mail la adresa de suport;Ati asteptat remedierea fara a intreprinde nici o actiune', 
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
select * from `questions`;

insert into `survey_results`(CRTTIME, CRTUSER, SURVEY) values('2016-01-08 18:50:35', 'ovi', 1);
select * from `survey_results`;

insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Mai mult fals', '2016-01-08 18:50:35', 'ovi', 1, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Destul de adevarat', '2016-01-08 18:50:35', 'ovi', 2, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Total fals', '2016-01-08 18:50:35', 'ovi', 3, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Total adevarat', '2016-01-08 18:50:35', 'ovi', 4, 1);
insert into `completed_answers` (TXT, CRTTIME, CRTUSER, QSTID, SURVEY_RESULT)
	values('Destul de adevrat', '2016-01-08 18:50:35', 'ovi', 5, 1);
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

select * from `completed_answers` 