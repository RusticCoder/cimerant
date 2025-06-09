CREATE TABLE sname_example (
    login_sname SYSNAME DEFAULT SUSER_SNAME(),
    employee_id UNIQUEIDENTIFIER DEFAULT NEWID(),
    login_date DATETIME DEFAULT GETDATE()
    )
