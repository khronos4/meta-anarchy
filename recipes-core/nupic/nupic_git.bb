DESCRIPTION = "Numenta Platform for Intelligent Computing"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/numenta/nupic.git;rev=718c48172b845ffa60195e3f633b28ba4c5de9c5"
S = "${WORKDIR}/git"

DEPENDS = "swig apr apr-util zlib libyaml python \
	python-asteval \
	python-mock \
	python-ordereddict \
	python-pillow \
	python-psutil \
	python-pylint \
	python-pytest \
	python-pytest-cov \
	python-pytest-xdist \
	python-dateutil \
	python-pyyaml \
	python-unittest2 \
	python-validictory \
	python-pymysql \
	python-dbutils \
	python-numpy \
	python-tweepy \
"

PYTHON_VERSION = "2.7"

EXTRA_OECMAKE = " \
	-DPYTHON_VERSION=${PYTHON_VERSION} \
	-DPYTHON_INCLUDE_DIR:PATH=${STAGING_INCDIR}/python${PYTHON_VERSION} \
	-DPYTHON_LIBRARY_DIR:PATH=${STAGING_LIBDIR} \
	-DPYTHON_SITE_PACKAGES_DIR:PATH=${STAGING_LIBDIR}/python${PYTHON_VERSION}/site-packages \
	-DNUMPY_INCLUDE_DIR:PATH=${STAGING_LIBDIR}/python${PYTHON_VERSION}/site-packages/numpy/core/include \
	-DNUMPY_VERSION="1.7.0" \
	-DNUPIC_LIB_STATIC_APR1:PATH=${STAGING_LIBDIR}/libapr-1.a \
	-DNUPIC_LIB_STATIC_APRUTIL1:PATH=${STAGING_LIBDIR}/libaprutil-1.a \
	-DNUPIC_LIB_STATIC_Z:PATH=${STAGING_LIBDIR}/libz.a \
	-DNUPIC_LIB_STATIC_YAML:PATH=${STAGING_LIBDIR}/libyaml.a \
"

inherit cmake

do_configure_prepend () {
	mkdir -p "${S}/apr-1"
	cp "${STAGING_INCDIR}/apr_*" "${S}/apr-1/"
}


