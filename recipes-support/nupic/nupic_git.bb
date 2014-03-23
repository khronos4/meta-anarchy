DESCRIPTION = "Numenta Platform for Intelligent Computing"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git:///mnt/storage/work/repo/nupic;rev=015c61a38aa5a549e47bf22a800b91d9d1b89c21"

S = "${WORKDIR}/git"

DEPENDS = "swig apr apr-util zlib yaml-cpp python \
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
	-DNUPIC_LIB_APR1:PATH=${STAGING_LIBDIR}/libapr-1.so \
	-DNUPIC_LIB_APRUTIL1:PATH=${STAGING_LIBDIR}/libaprutil-1.so \
	-DNUPIC_LIB_Z:PATH=${STAGING_LIBDIR}/libz.so \
	-DNUPIC_LIB_YAML:PATH=${STAGING_LIBDIR}/libyaml-cpp.so \
"

inherit cmake

do_configure_prepend () {
	mkdir -p "${S}/apr-1"

	ls ${STAGING_INCDIR} | grep "^apr" |
	while read LINE
	do
		cp -u ${STAGING_INCDIR}/"$LINE" ${S}/apr-1
	done
}
