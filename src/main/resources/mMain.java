11:49:29.031 [main] WARN    org.hibernate.orm.deprecation - HHH90000012: Recognized obsolete hibernate namespace http://hibernate.sourceforge.net/hibernate-configuration. Use namespace http://www.hibernate.org/dtd/hibernate-configuration instead.  Support for obsolete DTD/XSD namespaces may be removed at any time.
11:49:29.338 [main] WARN    o.hibernate.orm.connections.pooling - HHH10001002: Using Hibernate built-in connection pool (not for production use!)
11:49:30.230 [main] WARN    o.h.t.s.i.ExceptionHandlerLoggedImpl - GenerationTarget encountered exception accepting command : Error executing DDL "drop table if exists Movie" via JDBC Statement
org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "drop table if exists Movie" via JDBC Statement
	at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlString(SchemaDropperImpl.java:387) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlStrings(SchemaDropperImpl.java:371) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaDropperImpl.dropFromMetadata(SchemaDropperImpl.java:246) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaDropperImpl.performDrop(SchemaDropperImpl.java:156) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:128) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:114) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:157) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:85) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:335) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:471) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:728) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:746) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at mate.academy.util.HibernateUtil.initSessionFactory(HibernateUtil.java:9) ~[classes/:na]
	at mate.academy.util.HibernateUtil.<clinit>(HibernateUtil.java:6) ~[classes/:na]
	at mate.academy.Main.main(Main.java:11) ~[classes/:na]
Caused by: java.sql.SQLException: No database selected
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:129) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at com.mysql.cj.jdbc.StatementImpl.executeInternal(StatementImpl.java:763) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at com.mysql.cj.jdbc.StatementImpl.execute(StatementImpl.java:648) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	... 15 common frames omitted
11:49:30.238 [main] WARN    o.h.t.s.i.ExceptionHandlerLoggedImpl - GenerationTarget encountered exception accepting command : Error executing DDL "create table Movie (id decimal(19,2) not null auto_increment, description varchar(255), title varchar(255), primary key (id)) engine=MyISAM" via JDBC Statement
org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "create table Movie (id decimal(19,2) not null auto_increment, description varchar(255), title varchar(255), primary key (id)) engine=MyISAM" via JDBC Statement
	at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlString(SchemaCreatorImpl.java:458) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlStrings(SchemaCreatorImpl.java:442) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaCreatorImpl.createFromMetadata(SchemaCreatorImpl.java:325) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaCreatorImpl.performCreation(SchemaCreatorImpl.java:169) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:138) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:124) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:168) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:85) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:335) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:471) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:728) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:746) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	at mate.academy.util.HibernateUtil.initSessionFactory(HibernateUtil.java:9) ~[classes/:na]
	at mate.academy.util.HibernateUtil.<clinit>(HibernateUtil.java:6) ~[classes/:na]
	at mate.academy.Main.main(Main.java:11) ~[classes/:na]
Caused by: java.sql.SQLException: No database selected
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:129) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at com.mysql.cj.jdbc.StatementImpl.executeInternal(StatementImpl.java:763) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at com.mysql.cj.jdbc.StatementImpl.execute(StatementImpl.java:648) ~[mysql-connector-j-8.0.32.jar:8.0.32]
	at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.6.10.Final.jar:5.6.10.Final]
	... 15 common frames omitted
11:49:30.298 [main] WARN    o.h.e.jdbc.spi.SqlExceptionHelper - SQL Error: 1046, SQLState: 3D000
11:49:30.299 [main] ERROR   o.h.e.jdbc.spi.SqlExceptionHelper - No database selected
Exception in thread "main" org.hibernate.exception.GenericJDBCException: could not execute statement
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:42)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:113)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:99)
	at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.executeUpdate(ResultSetReturnImpl.java:200)
	at org.hibernate.dialect.identity.GetGeneratedKeysDelegate.executeAndExtract(GetGeneratedKeysDelegate.java:58)
	at org.hibernate.id.insert.AbstractReturningDelegate.performInsert(AbstractReturningDelegate.java:43)
	at org.hibernate.persister.entity.AbstractEntityPersister.insert(AbstractEntityPersister.java:3279)
	at org.hibernate.persister.entity.AbstractEntityPersister.insert(AbstractEntityPersister.java:3885)
	at org.hibernate.action.internal.EntityIdentityInsertAction.execute(EntityIdentityInsertAction.java:84)
	at org.hibernate.engine.spi.ActionQueue.execute(ActionQueue.java:645)
	at org.hibernate.engine.spi.ActionQueue.addResolvedEntityInsertAction(ActionQueue.java:282)
	at org.hibernate.engine.spi.ActionQueue.addInsertAction(ActionQueue.java:263)
	at org.hibernate.engine.spi.ActionQueue.addAction(ActionQueue.java:317)
	at org.hibernate.event.internal.AbstractSaveEventListener.addInsertAction(AbstractSaveEventListener.java:330)
	at org.hibernate.event.internal.AbstractSaveEventListener.performSaveOrReplicate(AbstractSaveEventListener.java:287)
	at org.hibernate.event.internal.AbstractSaveEventListener.performSave(AbstractSaveEventListener.java:193)
	at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:123)
	at org.hibernate.event.internal.DefaultSaveOrUpdateEventListener.saveWithGeneratedOrRequestedId(DefaultSaveOrUpdateEventListener.java:194)
	at org.hibernate.event.internal.DefaultSaveEventListener.saveWithGeneratedOrRequestedId(DefaultSaveEventListener.java:38)
	at org.hibernate.event.internal.DefaultSaveOrUpdateEventListener.entityIsTransient(DefaultSaveOrUpdateEventListener.java:179)
	at org.hibernate.event.internal.DefaultSaveEventListener.performSaveOrUpdate(DefaultSaveEventListener.java:32)
	at org.hibernate.event.internal.DefaultSaveOrUpdateEventListener.onSaveOrUpdate(DefaultSaveOrUpdateEventListener.java:75)
	at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:107)
	at org.hibernate.internal.SessionImpl.fireSave(SessionImpl.java:672)
	at org.hibernate.internal.SessionImpl.save(SessionImpl.java:665)
	at org.hibernate.internal.SessionImpl.save(SessionImpl.java:660)
	at mate.academy.Main.main(Main.java:16)
Caused by: java.sql.SQLException: No database selected
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:129)
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeInternal(ClientPreparedStatement.java:916)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1061)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1009)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeLargeUpdate(ClientPreparedStatement.java:1320)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdate(ClientPreparedStatement.java:994)
	at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.executeUpdate(ResultSetReturnImpl.java:197)
	... 23 more

Process finished with exit code 1
