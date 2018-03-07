/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.datastore.couchdb.dialect.type.impl;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.internal.util.compare.ComparableComparator;
import org.hibernate.type.StringType;
import org.hibernate.type.VersionType;

import java.util.Comparator;

/**
 * A {@link StringType} which implements the {@link VersionType} contract and thus supports optimistic locking done by
 * the datastore.
 *
 * @author Gunnar Morling
 */
public class CouchDBStringType extends StringType implements VersionType<String> {

	public static final CouchDBStringType INSTANCE = new CouchDBStringType();

	@Override
	public String seed(SharedSessionContractImplementor session) {
		return null;
	}

	@Override
	public String next(String current, SharedSessionContractImplementor session) {
		return current;
	}

	@Override
	public Comparator<String> getComparator() {
		return ComparableComparator.INSTANCE;
	}
}
