-- Initial data for tables (empty for now)
INSERT INTO personal_info (first_name, last_name, title, profile_description, profile_image_url, years_of_experience, email, phone, linkedin_url, github_url) VALUES
('Juan', 'Perez', 'Full Stack Developer', 'Soy un desarrollador apasionado con experiencia en la creación de aplicaciones web modernas y escalables. Me especializo en tecnologías backend con Spring Boot y frontend con React, con un enfoque en crear soluciones que resuelvan problemas reales. Me encanta aprender nuevas tecnologías y resolver desafíos complejos. Valoro la calidad del código, la comunicación clara y la colaboración en equipo.', 'img/profile-placeholder.jpg', 5, 'juan.perez@example.com', '+5491112345678', 'https://linkedin.com/in/juanperez', 'https://github.com/juanperez');

INSERT INTO skills (name, level_percentage, icon_class, personal_info_id) VALUES
('Java', 90, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/java.svg', 1),
('Spring Boot', 85, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/springboot.svg', 1),
('PHP', 80, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/php.svg', 1),
('Laravel', 80, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/laravel.svg', 1),
('PostgreSQL', 80, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/postgresql.svg', 1),
('HTML', 95, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/html5.svg', 1),
('CSS', 90, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/css3.svg', 1),
('JavaScript', 75, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/javascript.svg', 1),
('Angular', 70, 'https://cdn.jsdelivr.net/npm/simple-icons@latest/icons/angular.svg', 1);

INSERT INTO educations (degree, institution, start_date, end_date, description, personal_info_id) VALUES
('Ingeniería en Sistemas', 'Universidad XYZ', '2015-03-01', '2020-12-15', 'Especialización en desarrollo de software y bases de datos.', 1),
('Curso de Spring Boot Avanzado', 'Plataforma ABC', '2021-01-10', '2021-06-30', 'Profundización en microservicios y seguridad.', 1);

INSERT INTO experiences (job_title, company_name, start_date, end_date, description, personal_info_id) VALUES
('Desarrollador Full Stack Senior', 'Tech Solutions S.A.', '2022-01-01', NULL, 'Desarrollo y mantenimiento de aplicaciones empresariales. Liderazgo técnico de equipo de 3 personas.', 1),
('Desarrollador Backend Junior', 'Innovatech Labs', '2020-09-01', '2021-12-31', 'Participación en el desarrollo de APIs RESTful y optimización de bases de datos.', 1);

INSERT INTO projects (title, description, image_url, project_url, personal_info_id) VALUES
('Proyecto 1', 'Descripción del proyecto 1', 'img/projects/project1.jpg', 'https://github.com/juanperez/project1', 1),
('Proyecto 2', 'Descripción del proyecto 2', 'img/projects/project2.jpg', 'https://github.com/juanperez/project2', 1);
