# Hibernate OGM CouchDB

*Version: 5.2.0.Alpha1 - 07-09-2017*

## Description

This project integrates [Hibernate OGM](http://hibernate.org/ogm/) with [CouchDB](http://couchdb.apache.org/).

For running the tests in the _couchdb_ module, an installed CouchDB server is required. Specify its host name by
setting the environment variable `COUCHDB_HOSTNAME` prior to running the test suite:

    export COUCHDB_HOSTNAME=couchdb-machine

If this variable is not set, the _couchdb_ module still will be compiled and packaged but the tests will be skipped.
If needed, the port to connect to can be configured through the environment variable `COUCHDB_PORT`.

## License

This software and its documentation are distributed under the terms of the
FSF Lesser Gnu Public License (see license.txt).
