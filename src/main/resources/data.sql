INSERT INTO post(id, content) VALUES (1, 'Dette er første post')
INSERT INTO post(id, content) VALUES (2, 'Dette er anden post')
INSERT INTO post(id, content) VALUES (3, 'Dette er tredje post')
INSERT INTO post(id, content) VALUES (4, 'Dette er fjerde post')
INSERT INTO post(id, content) VALUES (5, 'Dette er femte post')

INSERT INTO comment(id, content, fk_post_id) VALUES (1, 'Dette er en kommentar', 1)
INSERT INTO comment(id, content, fk_post_id) VALUES (2, 'Dette er endnu en kommentar', 1)
INSERT INTO comment(id, content, fk_post_id) VALUES (3, 'Dette er en kommentar til anden post', 2)