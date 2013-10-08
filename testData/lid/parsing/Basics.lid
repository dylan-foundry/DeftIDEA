library:      leveldb
executable:   leveldb-dylan
target-type:  dll
license:      See License.txt in this distribution for details.
warranty:     Distributed WITHOUT WARRANTY OF ANY KIND
files:        library
              leveldb
c-object-files: ext/leveldb/libleveldb.a
c-libraries:  -lstdc++
              -lsnappy
